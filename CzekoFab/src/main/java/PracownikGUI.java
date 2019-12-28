import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracownikGUI extends JFrame implements ActionListener {

    String[] rodzajeGorzkiej = {"","50 %", "70 %", "90 %"};
    String[] rodzajeMlecznej = {"","18 %", "20 %", "25 %"};
    String[] rodzajeZ_dodatkami = {"","orzechy", "nadzienie", "bakalie"};
    JComboBox gorzkaCobo,mlecznaCobo,z_DodatkamiCobo;
    JTextField gorzkaText,mlecznaText,z_DodatkamiText;
    JButton sprzedaj,gorzkaPrzegladaj, mlecznaPrzegladaj, z_dodatkamiPrzegladaj;
    JLabel gorzka,mleczna,z_dodatkami,ilosc;


    PracownikGUI(){
        setSize(650, 500);
        setTitle("CzekoFab: okno pracownika");
        setLocation(300,300);
        this.getContentPane().setBackground(Color.blue);
        setLayout(null);
        JLabel infoStartowe1 = new JLabel("Wybierz jaki typ i ile sztuk czekolad chcesz sprzedać: ");
        JLabel infoStartowe2 = new JLabel("Wybierz jaki typ czekolad chcesz przeglądać: ");
        infoStartowe1.setForeground(Color.BLACK);
        infoStartowe2.setForeground(Color.BLACK);

        infoStartowe1.setBounds(10,10,350,30);
        add(infoStartowe1);
        infoStartowe2.setBounds(370,10,350,30);
        add(infoStartowe2);

        ilosc = new JLabel("ILOŚĆ");
        gorzka = new JLabel("GORZKA");
        mleczna = new JLabel("MLECZNA");
        z_dodatkami = new JLabel("Z DODATKAMI");
        gorzkaCobo = new JComboBox(rodzajeGorzkiej);
        mlecznaCobo = new JComboBox(rodzajeMlecznej);
        z_DodatkamiCobo = new JComboBox(rodzajeZ_dodatkami);
        gorzkaText = new JTextField();
        mlecznaText = new JTextField();
        z_DodatkamiText = new JTextField();
        sprzedaj = new JButton("SPRZEDAJ");
        gorzkaPrzegladaj = new JButton("GORZKA");
        mlecznaPrzegladaj = new JButton("MLECZNA");
        z_dodatkamiPrzegladaj = new JButton("Z DODATKAMI");

        ilosc.setForeground(Color.black);
        ilosc.setBounds(270,50,200,30);
        add(ilosc);

        gorzka.setForeground(Color.black);
        gorzka.setBounds(100,50,200,30);
        add(gorzka);
        gorzkaCobo.setBounds(50,90,200,30);
        add(gorzkaCobo);
        gorzkaCobo.setSelectedIndex(0);
        add(gorzkaText);
        gorzkaText.setBounds(270,90,50,30);
        add(gorzkaPrzegladaj);
        gorzkaPrzegladaj.setBounds(390,90,150,30);
        gorzkaPrzegladaj.addActionListener(this);


        mleczna.setForeground(Color.black);
        mleczna.setBounds(100,130,200,30);
        add(mleczna);
        mlecznaCobo.setBounds(50,170,200,30);
        add(mlecznaCobo);
        mlecznaCobo.setSelectedIndex(0);
        add(mlecznaText);
        mlecznaText.setBounds(270,170,50,30);
        add(mlecznaPrzegladaj);
        mlecznaPrzegladaj.setBounds(390,170,150,30);
        mlecznaPrzegladaj.addActionListener(this);

        z_dodatkami.setForeground(Color.black);
        z_dodatkami.setBounds(100,210,200,30);
        add(z_dodatkami);
        z_DodatkamiCobo.setBounds(50,250,200,30);
        add(z_DodatkamiCobo);
        z_DodatkamiCobo.setSelectedIndex(0);
        add(z_DodatkamiText);
        z_DodatkamiText.setBounds(270,250,50,30);
        add(z_dodatkamiPrzegladaj);
        z_dodatkamiPrzegladaj.setBounds(390,250,150,30);
        z_dodatkamiPrzegladaj.addActionListener(this);

        add(sprzedaj);
        sprzedaj.setBounds(100, 350,200,30);
        sprzedaj.addActionListener(this);

    }

    public void uruchomPracownikGUI(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gorzkaPrzegladaj) {
            System.out.println("Chcesz przeglądać gorzką czekoladę");
        } if (e.getSource() == mlecznaPrzegladaj) {
            System.out.println("Chcesz przeglądać mleczną czekoladę");
        } if (e.getSource() == z_dodatkamiPrzegladaj) {
            System.out.println("Chcesz przeglądać czekoladę z dodatkami");
        }
        if (e.getSource() == sprzedaj) {
            String msg1 = (String) gorzkaCobo.getSelectedItem();
            String msg2 = (String) mlecznaCobo.getSelectedItem();
            String msg3 = (String) z_DodatkamiCobo.getSelectedItem();
            switch (msg1) {
                case "50 %":
                    if (!gorzkaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + gorzkaText.getText() + " gorzkich czekolad o 50% zawartości kakao");
                    break;
                case "70 %":
                    if (!gorzkaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + gorzkaText.getText() + " gorzkich czekolad o 70% zawartości kakao");
                    break;
                case "90 %":
                    if (!gorzkaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + gorzkaText.getText() + " gorzkich czekolad o 90% zawartości kakao");
                    break;
                case "":
                    break;
                default:
                    System.out.println("upss, coś poszło nie tak");
            }
            switch (msg2) {
                case "18 %":
                    if (!mlecznaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + mlecznaText.getText() + " mlecznych czekolad o 18% zawartości tłuszczu");
                    break;
                case "20 %":
                    if (!mlecznaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + mlecznaText.getText() + " mlecznych czekolad o 20% zawartości tłuszczu");
                    break;
                case "25 %":
                    if (!mlecznaText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + mlecznaText.getText() + " mlecznych czekolad o 25% zawartości tłuszczu");
                    break;
                case "":
                    break;
                default:
                    System.out.println("upss, coś poszło nie tak");
            }
            switch (msg3) {
                case "orzechy":
                    if (!z_DodatkamiText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + z_DodatkamiText.getText() + " czekolad z orzechami");
                    break;
                case "nadzienie":
                    if (!z_DodatkamiText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + z_DodatkamiText.getText() + " czekolad z nadzieniem");
                    break;
                case "bakalie":
                    if (!z_DodatkamiText.getText().isEmpty())
                        System.out.println("Sprzedałeś " + z_DodatkamiText.getText() + " czekolad z bakaliami");
                    break;
                case "":
                    break;
                default:
                    System.out.println("upss, coś poszło nie tak");
            }
        }
    }
}