package tears.services.copyinformationtofileservice.impl;

import lombok.Cleanup;
import lombok.NoArgsConstructor;
import tears.services.copyinformationtofileservice.CopyService;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Ваня on 07.09.2017.
 */
@NoArgsConstructor(staticName = "of")
public class CopyServiceImpl implements CopyService {

    String[] informationList = {"1. Driver id", "2. Name", "3. Surname", "4. Age", "5. Phone", "6. Tons delivered", "7. Years in company"};

    @Override
    public void copyFromFileToFile() throws IOException {
        @Cleanup
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter path of file you want to copy from");
        String pathFrom = scan.nextLine();
        File fileFrom = new File(pathFrom);
        if(!fileFrom.exists()){
            System.out.println("This file doesn't exist");
            copyFromFileToFile();
            return;
        }
        System.out.println("Enter path of file you want to copy to");
        String pathTo = scan.nextLine();
        File fileTo = new File(pathTo);
        if(!fileTo.exists()){
            System.out.println("This file doesn't exist but you can to create new file");
            System.out.println("Do you want? Press: 1-Yes, 2-No");
            int selection = scan.nextInt();
            switch (selection){
                case 1:
                    fileTo.createNewFile();
                    break;
                case 2:
                    return;
                    default:
                        System.out.println("Please, select 1 or 2");
                        break;
            }
        }
            System.out.println("Select what data you want to add into file");
            for(String s:informationList){
                System.out.println(s);
            }
             int data = scan.nextInt();
             @Cleanup
             BufferedReader br = new BufferedReader(new FileReader(fileFrom));
             String buff;
             @Cleanup
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileTo, true));
             switch (data){
                case 1:
                    while ((buff=br.readLine())!=null){
                        if(buff.contains("Driver id")){
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                case 2:
                    while ((buff=br.readLine())!=null){
                    if(buff.contains("Name")){
                        bw.write(buff + "\n");
                    }
                }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                break;
                case 3:
                    while ((buff = br.readLine()) != null) {
                        if (buff.contains("Surname")) {
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                case 4:
                    while ((buff = br.readLine()) != null) {
                        if (buff.contains("Age")) {
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                case 5:
                    while ((buff = br.readLine()) != null) {
                        if (buff.contains("Phone number")) {
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                case 6:
                    while ((buff = br.readLine()) != null) {
                        if (buff.contains("Tons delivered")) {
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                case 7:
                    while ((buff = br.readLine()) != null) {
                        if (buff.contains("Years in company")) {
                            bw.write(buff + "\n");
                        }
                    }
                    bw.write("\n");
                    System.out.println("Information was successfully added into file");
                    break;
                    default:
                        System.out.println("Please, select from 1 to 7");
                        break;
            }
    }
}
