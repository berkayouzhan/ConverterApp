import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class TemperatureConverter {
    //Eser Özbilgiç, Ibrahim Berkay Oğuzhan, Sercan Yeşil
    // Declare the GUI Elements
    //   TEMPERATURE
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel lblKelvin;
    public static JTextField textKelvin;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateCtoK;
    public static JButton btnCalculateFtoC;
    public static JButton btnCalculateFtoK;

    public static JButton btnCalculateKtoC;
    public static JButton btnCalculateKtoF;

    public static JButton btnCalculateMtoKM;

    // UNITS

    public static JTextField textMeter;
    public static JLabel lblMeter;
    public static JTextField textKilometer;
    public static JLabel lblKilometer;
    public static JButton btnCalculateMileToKM;

    public static JTextField textMile;
    public static JLabel lblMile;
    public static JTextField textKilometer2;
    public static JLabel lblKilometer2;
    public static JButton btnCalculateMToFoot;

    public static JTextField textFoot;
    public static JLabel lblFoot;
    public static JTextField textMeter2;
    public static JLabel lblMeter2;
    public static JButton btnCalculateGToL;

    public static JTextField textUSgallon;
    public static JLabel lblGallon;
    public static JTextField textLiter;
    public static JLabel lblLiter;

    public static JButton btnCalculateSFtoSM;

    public static JTextField textSquareFoot;
    public static JLabel lblSquareFoot;
    public static JTextField textSquareMeter;
    public static JLabel lblSquareMeter;

    // CURRENCIES
    public static JLabel lblUSDollar;
    public static JTextField textUSDollar;
    public static JLabel lblEuro;
    public static JTextField textEuro;
    public static JLabel lblJapaneseYen;
    public static JTextField textJapaneseYen;
    public static JLabel lblPoundSterling;
    public static JTextField textPoundSterling;
    public static JLabel lblTurkishLira;
    public static JTextField textTurkishLira;
    public static JButton btnCalculateUSDtoEUR;
    public static JButton btnCalculateUSDtoJPY;
    public static JButton btnCalculateUSDtoGBP;
    public static JButton btnCalculateUSDtoTRY;
    public static JButton btnCalculateEURtoUSD;
    public static JButton btnCalculateEURtoJPY;
    public static JButton btnCalculateEURtoGBP;
    public static JButton btnCalculateEURtoTRY;
    public static JButton btnCalculateJPYtoUSD;
    public static JButton btnCalculateJPYtoEUR;
    public static JButton btnCalculateJPYtoGBP;
    public static JButton btnCalculateJPYtoTRY;
    public static JButton btnCalculateGBPtoUSD;
    public static JButton btnCalculateGBPtoEUR;
    public static JButton btnCalculateGBPtoJPY;
    public static JButton btnCalculateGBPtoTRY;
    public static JButton btnCalculateTRYtoUSD;
    public static JButton btnCalculateTRYtoEUR;
    public static JButton btnCalculateTRYtoJPY;
    public static JButton btnCalculateTRYtoGBP;


    public static void main(String[] args) {


        //Sercan Yeşil
        // Set up the frame
        frmMain = new JFrame("KFAU Converter");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Converter Chooser");

        JMenuItem i1 = new JMenuItem("Temperature Converter");
        JMenuItem i2 = new JMenuItem("Unit Converter");
        JMenuItem i3 = new JMenuItem("Currency Converter");
        JMenuItem i4 = new JMenuItem("Live Time Zones");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);

        //Berkay and Eser
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Sercan Yeşil
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frmMain = new JFrame("Unit Converter");
                frmMain.setSize(600, 400);
                frmMain.setLayout(new FlowLayout());

                frmMain.setBackground(Color.BLUE);

                frmMain.setVisible(true);
                frmMain.add(lblMeter);
                frmMain.add(textMeter);
                frmMain.add(btnCalculateMtoKM);
                frmMain.add(lblKilometer);
                frmMain.add(textKilometer);

                frmMain.add(lblMile);
                frmMain.add(textMile);
                frmMain.add(btnCalculateMileToKM);
                frmMain.add(lblKilometer2);
                frmMain.add(textKilometer2);

                frmMain.add(lblFoot);
                frmMain.add(textFoot);
                frmMain.add(btnCalculateMToFoot);
                frmMain.add(lblMeter2);
                frmMain.add(textMeter2);

                frmMain.add(lblGallon);
                frmMain.add(textUSgallon);
                frmMain.add(btnCalculateGToL);
                frmMain.add(lblLiter);
                frmMain.add(textLiter);

                frmMain.add(lblSquareFoot);
                frmMain.add(textSquareFoot);
                frmMain.add(btnCalculateSFtoSM);
                frmMain.add(lblSquareMeter);
                frmMain.add(textSquareMeter);


                btnCalculateMtoKM = new JButton("Convert M to KM");
                btnCalculateMtoKM.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String mText = textMeter.getText();
                        double m = Double.parseDouble(mText);
                        double kM = m / 1000;
                        textKilometer.setText(String.valueOf(kM));
                    }
                });
                btnCalculateMileToKM = new JButton("Convert Mile to KM");
                btnCalculateMileToKM.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String mileText = textMile.getText();
                        double mile = Double.parseDouble(mileText);
                        double kM = mile * 1.609;
                        textKilometer2.setText(String.valueOf(kM));
                    }
                });
                btnCalculateMToFoot = new JButton("Convert Foot to M");
                btnCalculateMToFoot.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String footText = textFoot.getText();
                        double foot = Double.parseDouble(footText);
                        double m2 = foot * 0.3048;
                        textMeter2.setText(String.valueOf(m2));
                    }
                });
                btnCalculateGToL.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String gallonText = textUSgallon.getText();
                        double gallon = Double.parseDouble(gallonText);
                        double l = gallon * 3.78541;
                        textLiter.setText(String.valueOf(l));
                    }
                });
                btnCalculateSFtoSM.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String squareFootText = textSquareFoot.getText();
                        double squareFoot = Double.parseDouble(squareFootText);
                        double squareMeter = squareFoot * 0.09290304;
                        textSquareMeter.setText(String.valueOf(squareMeter));
                    }
                });

            }
        });
        //Ibrahim Berkay Oğuzhan
        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frmMain = new JFrame("Currency Converter");
                frmMain.setSize(600, 400);
                frmMain.setLayout(new FlowLayout());
                frmMain.setVisible(true);
                //currencies
                frmMain.add(lblUSDollar);
                frmMain.add(textUSDollar);
                frmMain.add(lblEuro);
                frmMain.add(textEuro);
                frmMain.add(lblJapaneseYen);
                frmMain.add(textJapaneseYen);
                frmMain.add(lblPoundSterling);
                frmMain.add(textPoundSterling);
                frmMain.add(lblTurkishLira);
                frmMain.add(textTurkishLira);
                //buttons
                frmMain.add(btnCalculateUSDtoEUR);
                frmMain.add(btnCalculateUSDtoJPY);
                frmMain.add(btnCalculateUSDtoGBP);
                frmMain.add(btnCalculateUSDtoTRY);
                frmMain.add(btnCalculateEURtoUSD);
                frmMain.add(btnCalculateEURtoJPY);
                frmMain.add(btnCalculateEURtoGBP);
                frmMain.add(btnCalculateEURtoTRY);
                frmMain.add(btnCalculateJPYtoUSD);
                frmMain.add(btnCalculateJPYtoGBP);
                frmMain.add(btnCalculateJPYtoTRY);
                frmMain.add(btnCalculateGBPtoUSD);
                frmMain.add(btnCalculateGBPtoEUR);
                frmMain.add(btnCalculateGBPtoJPY);
                frmMain.add(btnCalculateGBPtoTRY);
                frmMain.add(btnCalculateTRYtoUSD);
                frmMain.add(btnCalculateTRYtoEUR);
                frmMain.add(btnCalculateTRYtoJPY);
                frmMain.add(btnCalculateTRYtoGBP);
                // CONVENTERS
                btnCalculateUSDtoEUR = new JButton("USD to EUR");
                btnCalculateUSDtoEUR.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String usdText = textUSDollar.getText();
                        double usd = Double.parseDouble(usdText);
                        double eur = usd * 0.94;
                        textEuro.setText(String.valueOf(eur));
                    }
                });
                btnCalculateUSDtoJPY = new JButton("USD to JPY");
                btnCalculateUSDtoJPY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String usdText = textUSDollar.getText();
                        double usd = Double.parseDouble(usdText);
                        double jpy = usd * 131.95;
                        textJapaneseYen.setText(String.valueOf(jpy));
                    }
                });
                btnCalculateUSDtoGBP = new JButton("USD to GBP");
                btnCalculateUSDtoGBP.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String usdText = textUSDollar.getText();
                        double usd = Double.parseDouble(usdText);
                        double gbp = usd * 0.83;
                        textPoundSterling.setText(String.valueOf(gbp));
                    }
                });
                btnCalculateUSDtoTRY = new JButton("USD to TRY");
                btnCalculateUSDtoTRY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String usdText = textUSDollar.getText();
                        double usd = Double.parseDouble(usdText);
                        double tl = usd * 18.67;
                        textTurkishLira.setText(String.valueOf(tl));
                    }
                });
                btnCalculateEURtoUSD = new JButton("EUR to USD");
                btnCalculateEURtoUSD.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String eurText = textEuro.getText();
                        double eur = Double.parseDouble(eurText);
                        double usd = eur * 1.06;
                        textUSDollar.setText(String.valueOf(usd));
                    }
                });
                btnCalculateEURtoJPY = new JButton("EUR to JPY");
                btnCalculateEURtoJPY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String eurText = textEuro.getText();
                        double eur = Double.parseDouble(eurText);
                        double jpy = eur * 140.32;
                        textJapaneseYen.setText(String.valueOf(jpy));
                    }
                });
                btnCalculateEURtoGBP = new JButton("EUR to GBP");
                btnCalculateEURtoGBP.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String eurText = textEuro.getText();
                        double eur = Double.parseDouble(eurText);
                        double gbp = eur * 0.88;
                        textPoundSterling.setText(String.valueOf(gbp));
                    }
                });
                btnCalculateEURtoTRY = new JButton("EUR to TRY");
                btnCalculateEURtoTRY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String eurText = textEuro.getText();
                        double eur = Double.parseDouble(eurText);
                        double tl = eur * 19.86;
                        textTurkishLira.setText(String.valueOf(tl));
                    }
                });
                btnCalculateJPYtoUSD = new JButton("JPY to USD");
                btnCalculateJPYtoUSD.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jpyText = textJapaneseYen.getText();
                        double jpy = Double.parseDouble(jpyText);
                        double usd = jpy * 0.0076;
                        textUSDollar.setText(String.valueOf(usd));
                    }
                });
                btnCalculateJPYtoEUR = new JButton("JPY to EUR");
                btnCalculateJPYtoEUR.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jpyText = textJapaneseYen.getText();
                        double jpy = Double.parseDouble(jpyText);
                        double eur = jpy * 0.0071;
                        textEuro.setText(String.valueOf(eur));
                    }
                });
                btnCalculateJPYtoGBP = new JButton("JPY to GBP");
                btnCalculateJPYtoGBP.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jpyText = textJapaneseYen.getText();
                        double jpy = Double.parseDouble(jpyText);
                        double gbp = jpy * 0.0063;
                        textPoundSterling.setText(String.valueOf(gbp));
                    }
                });
                btnCalculateJPYtoTRY = new JButton("JPY to TRY");
                btnCalculateJPYtoTRY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String jpyText = textJapaneseYen.getText();
                        double jpy = Double.parseDouble(jpyText);
                        double tl = jpy * 0.0071;
                        textTurkishLira.setText(String.valueOf(tl));
                    }
                });
                btnCalculateGBPtoUSD = new JButton("GBP to USD");
                btnCalculateGBPtoUSD.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String gbpText = textPoundSterling.getText();
                        double gbp = Double.parseDouble(gbpText);
                        double usd = gbp * 1.21;
                        textUSDollar.setText(String.valueOf(usd));
                    }
                });
                btnCalculateGBPtoEUR = new JButton("GBP to EUR");
                btnCalculateGBPtoEUR.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String gbpText = textPoundSterling.getText();
                        double gbp = Double.parseDouble(gbpText);
                        double eur = gbp * 1.14;
                        textEuro.setText(String.valueOf(eur));
                    }
                });
                btnCalculateGBPtoJPY = new JButton("GBP to JPY");
                btnCalculateGBPtoJPY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String gbpText = textPoundSterling.getText();
                        double gbp = Double.parseDouble(gbpText);
                        double jpy = gbp * 159.61;
                        textJapaneseYen.setText(String.valueOf(jpy));
                    }
                });
                btnCalculateGBPtoTRY = new JButton("GBP to TRY");
                btnCalculateGBPtoTRY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String gbpText = textPoundSterling.getText();
                        double gbp = Double.parseDouble(gbpText);
                        double tl = gbp * 22.60;
                        textTurkishLira.setText(String.valueOf(tl));
                    }
                });
                btnCalculateTRYtoUSD = new JButton("TRY to USD");
                btnCalculateTRYtoUSD.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String tlText = textTurkishLira.getText();
                        double tl = Double.parseDouble(tlText);
                        double usd = tl * 0.054;
                        textUSDollar.setText(String.valueOf(tl));
                    }
                });
                btnCalculateTRYtoEUR = new JButton("TRY to EUR");
                btnCalculateTRYtoEUR.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String tlText = textTurkishLira.getText();
                        double tl = Double.parseDouble(tlText);
                        double eur = tl * 0.05;
                        textEuro.setText(String.valueOf(eur));
                    }
                });
                btnCalculateTRYtoJPY = new JButton("TRY to JPY");
                btnCalculateTRYtoJPY.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String tlText = textTurkishLira.getText();
                        double tl = Double.parseDouble(tlText);
                        double jpy = tl * 7.07;
                        textJapaneseYen.setText(String.valueOf(jpy));
                    }
                });
                btnCalculateTRYtoGBP = new JButton("TRY to GBP");
                btnCalculateTRYtoGBP.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String tlText = textTurkishLira.getText();
                        double tl = Double.parseDouble(tlText);
                        double gbp = tl * 0.044;
                        textPoundSterling.setText(String.valueOf(gbp));
                    }
                });


            }
        });
        //Eser özbilgiç
        i4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frmMain = new JFrame("Time Converter");
                //frmMain.setSize(600, 400);
                //frmMain.setLayout(new FlowLayout());
                //frmMain.setVisible(true);

                TimeConverter.main();
            }
        });


        frmMain.setSize(600, 400);
        frmMain.setLayout(new FlowLayout());

        // Create GUI Elements for UNITS >> Sercan Yeşil
        lblSquareFoot = new JLabel("Square Foot:");
        textSquareFoot = new JTextField(13);
        lblSquareMeter = new JLabel("Square Meter:");
        btnCalculateSFtoSM = new JButton("Convert SF to SM");
        textSquareMeter = new JTextField(13);

        lblGallon = new JLabel("US Gallon:");
        textUSgallon = new JTextField(12);
        lblLiter = new JLabel("Liter:");
        btnCalculateGToL = new JButton("Convert US Gallon to Liter");
        textLiter = new JTextField(12);

        lblMeter2 = new JLabel("Meter:");
        textMeter2 = new JTextField(15);
        lblFoot = new JLabel("Foot:");
        btnCalculateMToFoot = new JButton("Convert Foot to Meter");
        textFoot = new JTextField(15);


        lblKilometer2 = new JLabel("Kilometer:");
        textKilometer2 = new JTextField(15);
        lblMile = new JLabel("Mile:");
        btnCalculateMileToKM = new JButton("Convert Mile to KM");
        textMile = new JTextField(15);


        lblKilometer = new JLabel("Kilometer:");
        textKilometer = new JTextField(15);
        lblMeter = new JLabel("Meter:");
        btnCalculateMtoKM = new JButton("Convert M to KM");
        textMeter = new JTextField(15);

        // TEMPERATURES(Eser and Berkay)


        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        lblKelvin = new JLabel("Kelvin:");
        textKelvin = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert C to F");
        btnCalculateCtoK = new JButton("Convert C to K");
        btnCalculateFtoC = new JButton("Convert F to C");
        btnCalculateFtoK = new JButton("Convert F to K");
        btnCalculateKtoC = new JButton("Convert K to C");
        btnCalculateKtoF = new JButton("Convert K to F");

        // currency unit = (Berkay Oğuzhan)

        lblUSDollar = new JLabel("USD:");
        textUSDollar = new JTextField(10);
        btnCalculateUSDtoEUR = new JButton("USD to EUR");
        btnCalculateUSDtoJPY = new JButton("USD to JPY");
        btnCalculateUSDtoGBP = new JButton("USD to GBP");
        btnCalculateUSDtoTRY = new JButton("USD to TRY");

        lblEuro = new JLabel("EUR:");
        textEuro = new JTextField(10);
        btnCalculateEURtoUSD = new JButton("EUR to USD");
        btnCalculateEURtoJPY = new JButton("EUR to JPY");
        btnCalculateEURtoGBP = new JButton("EUR to GBP");
        btnCalculateEURtoTRY = new JButton("EUR to TRY");

        lblJapaneseYen = new JLabel("JPY:");
        textJapaneseYen = new JTextField(10);
        btnCalculateJPYtoUSD = new JButton("JPY to USD");
        btnCalculateJPYtoEUR = new JButton("JPY to EUR");
        btnCalculateJPYtoGBP = new JButton("JPY to GBP");
        btnCalculateJPYtoTRY = new JButton("JPY to TRY");

        lblPoundSterling = new JLabel("GBP:");
        textPoundSterling = new JTextField(10);
        btnCalculateGBPtoUSD = new JButton("GBP to USD");
        btnCalculateGBPtoEUR = new JButton("GBP to EUR");
        btnCalculateGBPtoJPY = new JButton("GBP to JPY");
        btnCalculateGBPtoTRY = new JButton("GBP to TRY");

        lblTurkishLira = new JLabel("TRY:");
        textTurkishLira = new JTextField(10);
        btnCalculateTRYtoUSD = new JButton("TRY to USD");
        btnCalculateTRYtoEUR = new JButton("TRY to EUR");
        btnCalculateTRYtoGBP = new JButton("TRY to GBP");
        btnCalculateTRYtoJPY = new JButton("TRY to JPY");


        // Add ActionListener (Method and variables >> Eser and Berkay, IF else blocks and showing dialog > Sercan
        btnCalculateCtoF.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert C to F
                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double f = (c * 9 / 5) + 32;
                                if (c > -273) {
                                    textFahrenheit.setText(String.valueOf(f));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than -273 for Celcius");

                                }
                            }
                        }
                );
        btnCalculateCtoK.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert C to K
                                String cText = textCelsius.getText();
                                double c = Double.parseDouble(cText);
                                double k = c + 273;
                                if (c > -273) {
                                    textKelvin.setText(String.valueOf(k));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than -273 for Celcius");
                                }

                            }
                        }
                );
        // Add ActionListener
        btnCalculateFtoC.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert F to C
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double c = (f - 32) * 5 / 9;
                                if (f > -459) {
                                    textCelsius.setText(String.valueOf(c));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than -459 for Fahrenheit");
                                }

                            }
                        }
                );
        // Add ActionListener
        btnCalculateFtoK.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert F to K
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double k = (f - 32) * 5 / 9 + 273;
                                if (f > -459) {
                                    textKelvin.setText(String.valueOf(k));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than -459 for Fahrenheit");
                                }
                            }
                        }
                );

        btnCalculateKtoC.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert K to C
                                String kText = textKelvin.getText();
                                double k = Double.parseDouble(kText);
                                double c = k - 273;
                                if (k > 0) {

                                    textCelsius.setText(String.valueOf(c));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than 0 for Kelvin");
                                }

                            }
                        }
                );
        btnCalculateKtoF.addActionListener
                (
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Convert K to F
                                String kText = textKelvin.getText();
                                double k = Double.parseDouble(kText);
                                double f = (k - 273) * 9 / 5 + 32;
                                if (k > 0) {
                                    textFahrenheit.setText(String.valueOf(f));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please enter bigger than 0 for Kelvin");
                                }
                            }
                        }
                );

        // Add the GUI Elements to the frame (Sercan Eser and Berkay)
        mb.add(menu);
        frmMain.setJMenuBar(mb);
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateCtoK);
        frmMain.add(btnCalculateFtoC);
        frmMain.add(btnCalculateFtoK);

        frmMain.add(btnCalculateKtoC);
        frmMain.add(btnCalculateKtoF);

        // Make the frame visible
        frmMain.setVisible(true);
    }
}