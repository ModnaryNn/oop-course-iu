public class particle {
    private int x,y;

    enum Direction{
        N,NE,E,SE,S,SW,W,NW;
    }

    private static final SecureRandom random = new SecureRandom();

    public static getRandomMove{
        int x = random.nextInt(Direction().length);
        return Direction()[x];
    }

    public static move{
        switch (getRandomMove){
            case N:             //+ North (decreasing its y by 1),
                y--;
                break;
            case NE:            //+ North East (decreasing its y by 1 and increasing its x by 1),
                y--;
                x++;
                break;
            case E:             //+ East (increasing its x by 1),
                x++;
                break;
            case SE:            //+ East (increasing its x by 1),
                y++;
                x++;
                break;
            case S:             //+ South (increasing its y by 1),
                y++;
                break;
            case SW:            //+ South West (increasing its y by 1 and decreasing its x by 1),
                y++;
                x--;
                break;
            case W:             //+ West (decreasing its x by 1),
                x--;
                break;
            case NW:            //+ North West (decreasing its y by 1 and decreasing its x by 1)
                y--;
                x--;
                break;
        }
    }
}
