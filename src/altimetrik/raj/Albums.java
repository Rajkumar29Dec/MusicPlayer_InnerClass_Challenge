package altimetrik.raj;

import java.util.ArrayList;

public class Albums {
    String AlbumName;
    ArrayList<Songs> song=new ArrayList<>();

    public Albums(String albumName) {
        AlbumName = albumName;
    }

    public void Display() {

    }


    private class Songs {
        String songName;
        double DurationSong;

        public Songs(String songName, double durationSong) {
            this.songName = songName;
            DurationSong = durationSong;
        }

        public String getSongName() {
            return songName;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

        public double getDurationSong() {
            return DurationSong;
        }

        public void setDurationSong(double durationSong) {
            DurationSong = durationSong;
        }
    }
}
