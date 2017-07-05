import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

/**
 * Created by pc on 2017/7/3.
 */
public class Send
{
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args)
    {
        /*
            创建连接到RabbitMQ
         */
        ConnectionFactory factory = new ConnectionFactory();

        factory.setHost("192.168.1.110");//设置RabbitMQ所在的主机ip
        factory.setUsername("admin");   //指定用户名
        factory.setPassword("admin123");//指定密码
        factory.setPort(AMQP.PROTOCOL.PORT); //指定端口号5672
        //factory.setUri("amqp://userName:password@hostName:portNumber/virtualHost");
        //factory.setUri("amqp://admin:admin123@192.168.1.110:5672/");

        Connection connection = null;
        Channel channel = null;
        try {
            connection = factory.newConnection();   //创建一个连接
            channel = connection.createChannel(); //创建一个频道

            //指定一个队列
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            //发送的消息
            String message = "hello world!";
            //往队列中发出一条消息
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("Sent Message：'" + message + "'");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            close(connection, channel);
        }

    }

    public static void close(Connection connection, Channel channel)
    {
        if (null != channel)
        {
            try {
                channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        if(null != connection)
        {
            try {
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
