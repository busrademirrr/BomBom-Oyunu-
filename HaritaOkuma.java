import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HaritaOkuma 
{
    public static void main(String[] args) 
    {
        // 10x10'luk bir tamsayı matrisi oluştur
        int[][] harita = new int[10][10];

        try 
        {
            // 'harita.txt' dosyasını okumak için BufferedReader oluştur
            BufferedReader br = new BufferedReader(new FileReader("harita.txt"));
            String satir;
            int satirNo = 0;

            // Dosyadan satır okuma işlemi
            while ((satir = br.readLine()) != null && satirNo < 10) 
            {
                // Her satırdaki karakterleri tek tek oku ve tamsayıya çevir
                for (int i = 0; i < satir.length() && i < 10; i++) 
                {
                    harita[satirNo][i] = Character.digit(satir.charAt(i), 10);
                }
                // Sonraki satıra geç
                satirNo++;
            }

            // BufferedReader'ı kapat
            br.close();
        } 
        
        catch (IOException e) 
        {
            // Hata durumunda hata mesajını yazdır
            e.printStackTrace();
        }

        // Matrisi yazdırma 
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
        }
    }
}
