import java.util.ArrayList;
        import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) { // 1
        List<Integer> result = new ArrayList<>(); // 2

        for (int i = 0; i < timesList.size(); i++) { //3.1 3.2 3.3
            int hr = timesList.get(i).getHours();
            int min = timesList.get(i).getMinutes();
            int sec = timesList.get(i).getSeconds(); // 4
            if (hr < 0 || hr > 24){ //5
                if (hr < 0){ // 6
                    throw new RuntimeException("The hours are smaller than the minimum"); // 7
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum"); // 8
                }
            }
            else if (hr < 24) { //9
                if (min < 0 || min > 59) // 10
                    throw new RuntimeException("The minutes are not valid!"); // 11
                else {
                    if (sec >= 0 && sec <= 59) // 12
                        result.add(hr * 3600 + min * 60 + sec); // 13
                    else
                        throw new RuntimeException("The seconds are not valid"); // 14
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) { // 15
                result.add(hr * 3600 + min * 60 + sec); // 16
            }
            else {
                throw new RuntimeException("The time is greater than the maximum"); // 17
            }
        }
        return result; // 18
    } // 19
}
