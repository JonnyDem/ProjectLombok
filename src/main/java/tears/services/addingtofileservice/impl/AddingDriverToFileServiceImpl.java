package tears.services.addingtofileservice.impl;

import lombok.Cleanup;
import lombok.NoArgsConstructor;
import tears.dao.TruckDriverDao;
import tears.dao.factory.DaoFactory;
import tears.services.addingtofileservice.AddingDriverToFileService;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Ваня on 06.09.2017.
 */
@NoArgsConstructor(staticName = "of")
public class AddingDriverToFileServiceImpl implements AddingDriverToFileService {

    @Override
    public void addingDriverToFile() throws IOException {
        TruckDriverDao truckDriverDao = DaoFactory.getTruckDriverDao();
        @Cleanup
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter path of file you want to add data of driver in (example: C:\\Users\\Ваня\\IdeaProjects\\HendlingTruckDriver\\src\\main\\resources\\Data of drivers.txt )");
        String path = scan.nextLine();
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println("Enter driver id you want to add to file");
        int driverId = scan.nextInt();
        @Cleanup
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        int count = 0;
        scan = new Scanner(file);
        while (scan.hasNextLine()){
            if(scan.nextLine().equals("Driver id: "+driverId)){
                count++;
                System.out.println("This driver already exists in file");
            }
        }
        if (count == 0) {
            if(!truckDriverDao.isDriverExists(driverId)){
                System.out.println("There is no driver with this id in data base");
            } else {
                bw.write("Driver id: " + driverId + "\n");
                bw.write("Name: " + truckDriverDao.getNameById(driverId) + "\n");
                bw.write("Surname:" + truckDriverDao.getSurnameById(driverId) + "\n");
                bw.write("Age: " + truckDriverDao.getAgeById(driverId) + "\n");
                bw.write("Phone number: " + truckDriverDao.getPhoneById(driverId) + "\n");
                bw.write("Tons delivered: " + truckDriverDao.getHowManyTonsWereDelivered(driverId) + "\n");
                bw.write("Years in company: " + truckDriverDao.getHowManyYearsWorksInCompany(driverId) + "\n");
                bw.write("\n");
            }
        }
    }
}
