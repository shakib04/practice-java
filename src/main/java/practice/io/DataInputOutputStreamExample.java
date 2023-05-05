package practice.io;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {

    public static void exampleOfDataOutputStream() {
        String destinationFile = CommonData.thisDirectoryFilePath + "/primitivs.data";
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream(destinationFile));
            dataOutputStream.writeInt(152);
            dataOutputStream.writeDouble(4.46);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeLong(Long.MAX_VALUE);
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("DataInputOutputStreamExample.exampleOfDataOutputStream()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exampleOfDataInputStream() {
        String sourceFile = CommonData.thisDirectoryFilePath + "/primitivs.data";
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(
                new FileInputStream(sourceFile)
            );
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            long longValue = dataInputStream.readLong();
            System.out.printf("%s %s %s %s",intValue, doubleValue, booleanValue, longValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Driver (main) method
     * 
     * @param args
     */
    public static void main(String[] args) {
        DataInputOutputStreamExample.exampleOfDataOutputStream();
        DataInputOutputStreamExample.exampleOfDataInputStream();
    }
}
