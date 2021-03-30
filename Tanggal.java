/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
public class Tanggal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Format
        Calendar tgl = Calendar.getInstance();
        SimpleDateFormat contoh2 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat ev = new SimpleDateFormat("yyyy-MM-dd");
        
        //Tanggal sekarang
        String tgl2 = contoh2.format(tgl.getTime());
        String cnt = ev.format(tgl.getTime());
        System.out.println("Tanggal hari ini: " + tgl2 +" atau "+ cnt);
        
        //Sistem Tanggal
        tgl.setTimeInMillis(2000);
        String tgl3 = contoh2.format(tgl.getTime());
        String cnt2 = ev.format(tgl.getTime());
        System.out.println("Tanggal sistem Calender: " + tgl3 + " atau "+ cnt2);
        
        LocalDate bfr = LocalDate.parse(cnt2);
        LocalDate afr = LocalDate.parse(cnt);

        long Daybetween = ChronoUnit.DAYS.between(bfr,afr);
        long month = ChronoUnit.MONTHS.between(bfr,afr);
        long year = ChronoUnit.YEARS.between(bfr,afr);
        
         System.out.println(String.format("Jumlah Waktu yang sudah berlalu Hingga saat ini adalah %d Tahun %d bulan, %d Hari ",year,month,Daybetween));
    }
    
}
