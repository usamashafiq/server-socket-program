package testserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tserver {
    public static void main(String[] args) {
       try {
           //server object
           ServerSocket server = new ServerSocket(5000);
           System.out.println("server connected waiting for client");
           String[] name = {"Usama","Ali","Talha","Farooq","w","b","bye"};
           String[] pass = {"ABC","AB","ACB","BA"};
           int[] balance = {123,200,120,500};
           int withdraw ;



           while (true) {
               //wait for clint
               Socket Client = server.accept();
               System.out.println("client is connected");



               route:
               while (true) {
                   //Someone is connectd, now you can send or receive data
                   InputStream input = Client.getInputStream();
                   OutputStream ouput = Client.getOutputStream();
                   DataOutputStream out = new DataOutputStream(ouput);

                   String msge = "Type ID ";
                   //send msge to client
                   ouput.write(msge.getBytes());

                     //input the user name
                   String data = readline(input);
                   String data1 = readline(input);
                   String[] check ;

                   //split the string from white space
                   check = data.split("\\s");
                   String C = check[1];



                   //check for user One at the index one
                   if (C.equals(name[0])) {

                       msge = "Password ";
                       ouput.write(msge.getBytes());
                       data = readline(input);
                       data1 = readline(input);
                       //check the password
                       if (data.equals(pass[0])) {
                           msge = "OK  ";
                           ouput.write(msge.getBytes());

                           msge = "Enter b if you check a balance  ";
                           ouput.write(msge.getBytes());

                           data = readline(input);

                           //output for integer array
                           if (data.equals(name[5])) {
                               msge = "Balance ";
                               ouput.write(msge.getBytes());
                               out.writeUTF(String.valueOf(balance[0]));
                               msge = " Enter w if you want a withdraw amount  ";
                               ouput.write(msge.getBytes());

                               //read for withdraw amount
                               data1 = readline(input);
                               data = readline(input);

                               //enter the withdraw section
                               if (data.equals(name[4])) {
                                   msge = "Enter the amount  ";
                                   ouput.write(msge.getBytes());
                                   //read the withdraw amount
                                   data1 = readline(input);
                                   data = readline(input);
                                   //string number to integer
                                   withdraw = Integer.parseInt(data);
                                   if (withdraw <= balance[0]) {
                                       withdraw = balance[0] - withdraw;
                                       out.writeUTF(String.valueOf(withdraw));
                                       System.out.println("YES DOME");
                                       data1 = readline(input);
                                       data = readline(input);
                                       //close the connection
                                       if (data1.equals(name[6])) {
                                           continue route;

                                       }
                                   } else {
                                       msge = "Invalid amount ";
                                       ouput.write(msge.getBytes());
                                   }
                               }
                           }
                       }
                   }
                   //for user two
                   if (C.equals(name[1])) {

                       msge = "Password ";
                       ouput.write(msge.getBytes());
                       data = readline(input);
                       data1 = readline(input);
                       //check the password
                       if (data.equals(pass[1])) {
                           msge = "OK  ";
                           ouput.write(msge.getBytes());

                           msge = "Enter b if you check a balance  ";
                           ouput.write(msge.getBytes());

                           data = readline(input);

                           //output for integer array
                           if (data.equals(name[5])) {
                               msge = "Balance ";
                               ouput.write(msge.getBytes());
                               out.writeUTF(String.valueOf(balance[1]));
                               msge = " Enter w if you want a withdraw amount  ";
                               ouput.write(msge.getBytes());

                               //read for withdraw amount
                               data1 = readline(input);
                               data = readline(input);

                               //enter the withdraw section
                               if (data.equals(name[4])) {
                                   msge = "Enter the amount  ";
                                   ouput.write(msge.getBytes());
                                   //read the withdraw amount
                                   data1 = readline(input);
                                   data = readline(input);
                                   //string number to integer
                                   withdraw = Integer.parseInt(data);
                                   if (withdraw <= balance[1]) {
                                       withdraw = balance[1] - withdraw;
                                       out.writeUTF(String.valueOf(withdraw));
                                       System.out.println("YES DOME");
                                       data1 = readline(input);
                                       data = readline(input);
                                       //close the connection
                                       if (data1.equals(name[6])) {
                                           continue route;

                                       }
                                   } else {
                                       msge = "Invalid amount ";
                                       ouput.write(msge.getBytes());
                                   }
                               }
                           }
                       }
                   }

                   //for three user
                   if (C.equals(name[2])) {

                       msge = "Password ";
                       ouput.write(msge.getBytes());
                       data = readline(input);
                       data1 = readline(input);
                       //check the password
                       if (data.equals(pass[2])) {
                           msge = "OK  ";
                           ouput.write(msge.getBytes());

                           msge = "Enter b if you check a balance  ";
                           ouput.write(msge.getBytes());

                           data = readline(input);

                           //output for integer array
                           if (data.equals(name[5])) {
                               msge = "Balance ";
                               ouput.write(msge.getBytes());
                               out.writeUTF(String.valueOf(balance[2]));
                               msge = " Enter w if you want a withdraw amount  ";
                               ouput.write(msge.getBytes());

                               //read for withdraw amount
                               data1 = readline(input);
                               data = readline(input);

                               //enter the withdraw section
                               if (data.equals(name[4])) {
                                   msge = "Enter the amount  ";
                                   ouput.write(msge.getBytes());
                                   //read the withdraw amount
                                   data1 = readline(input);
                                   data = readline(input);
                                   //string number to integer
                                   withdraw = Integer.parseInt(data);
                                   if (withdraw <= balance[2]) {
                                       withdraw = balance[2] - withdraw;
                                       out.writeUTF(String.valueOf(withdraw));
                                       System.out.println("YES DOME");
                                       data1 = readline(input);
                                       data = readline(input);
                                       //close the connection
                                       if (data1.equals(name[6])) {
                                           continue route;

                                       }
                                   } else {
                                       msge = "Invalid amount ";
                                       ouput.write(msge.getBytes());
                                   }
                               }
                           }
                       }
                   }

                   //for user four
                   if (C.equals(name[3])) {

                       msge = "Password ";
                       ouput.write(msge.getBytes());
                       data = readline(input);
                       data1 = readline(input);
                       //check the password
                       if (data.equals(pass[3])) {
                           msge = "OK  ";
                           ouput.write(msge.getBytes());

                           msge = "Enter b if you check a balance  ";
                           ouput.write(msge.getBytes());

                           data = readline(input);

                           //output for integer array
                           if (data.equals(name[5])) {
                               msge = "Balance ";
                               ouput.write(msge.getBytes());
                               out.writeUTF(String.valueOf(balance[3]));
                               msge = " Enter w if you want a withdraw amount  ";
                               ouput.write(msge.getBytes());

                               //read for withdraw amount
                               data1 = readline(input);
                               data = readline(input);

                               //enter the withdraw section
                               if (data.equals(name[4])) {
                                   msge = "Enter the amount  ";
                                   ouput.write(msge.getBytes());
                                   //read the withdraw amount
                                   data1 = readline(input);
                                   data = readline(input);
                                   //string number to integer
                                   withdraw = Integer.parseInt(data);
                                   if (withdraw <= balance[3]) {
                                       withdraw = balance[3] - withdraw;
                                       out.writeUTF(String.valueOf(withdraw));
                                       System.out.println("YES DOME");
                                       data1 = readline(input);
                                       data = readline(input);
                                       //close the connection
                                       if (data1.equals(name[6])) {
                                           continue route;

                                       }
                                   } else {
                                       msge = "Invalid amount ";
                                       ouput.write(msge.getBytes());
                                   }
                               }
                           }
                       }
                   }

               }
//               System.out.println("connection closed");
               //close the server

           }
       }
        //server shutdown
        //server.close();
        catch (Exception e){
            e.printStackTrace();
        }

    }


    public static String readline(InputStream in) throws IOException{

        StringBuffer buf = new StringBuffer();
         int ch;

         while ((ch = in.read()) != -1) {
             if(ch == '\n' || ch == '\r') {
                 break;
             }
             buf.append((char) ch);
         }
        return buf.toString();
    }
   


}
