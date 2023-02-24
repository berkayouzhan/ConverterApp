import java.awt.*;
import java.util.*;
import javax.swing.*;

public class TimeConverter extends JFrame {
    //Eser Özbilgiç and Sercan Yeşil
    // Array of city names
    private static final String[] CITIES = {
            "New York", "London", "Paris", "Tokyo" ,"Johannesburg", "Istanbul", "Baku" , "Dubai" , "Berlin" ,"Auckland" };

    // Array of time zones for each city
    private static final TimeZone[] TIME_ZONES = {
            TimeZone.getTimeZone("America/New_York"),
            TimeZone.getTimeZone("Europe/London"),
            TimeZone.getTimeZone("Europe/Paris"),
            TimeZone.getTimeZone("Asia/Tokyo"),
            TimeZone.getTimeZone("Africa/Johannesburg"),
            TimeZone.getTimeZone("Europe/Istanbul"),
            TimeZone.getTimeZone("Asia/Baku"),
            TimeZone.getTimeZone("Asia/Dubai"),
            TimeZone.getTimeZone("Europe/Berlin"),
            TimeZone.getTimeZone("Pacific/Auckland")
    };

    // Label to display the current time
    private final JLabel timeLabel = new JLabel("", SwingConstants.CENTER);

    public TimeConverter() {
        // Set up the user interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Live Time Zones");
        setSize(600, 400);

        // Add combo box for selecting city
        JComboBox<String> cityComboBox = new JComboBox<>(CITIES);
        cityComboBox.addActionListener(e -> updateTime());

        // Add the time label to the frame
        add(timeLabel, BorderLayout.CENTER);
        add(cityComboBox, BorderLayout.SOUTH);

        // Set the initial time
        updateTime();
    }

    private void updateTime() {
        // Get the selected city index
        int cityIndex = ((JComboBox)getContentPane().getComponent(1)).getSelectedIndex();

        // Get the current time in the selected city's time zone
        Calendar calendar = Calendar.getInstance(TIME_ZONES[cityIndex]);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Update the time label
        timeLabel.setText(String.format("%02d:%02d:%02d", hour, minute, second));
    }

    public static void main() {
        TimeConverter converter = new TimeConverter();
        converter.setVisible(true);
    }
}