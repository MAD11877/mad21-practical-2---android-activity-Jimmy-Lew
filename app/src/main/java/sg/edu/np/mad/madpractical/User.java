package sg.edu.np.mad.madpractical;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    // Default Constructor
    public User(){

    }

    public User(String aName, String aDescription, int aId, boolean aFollowed){
        name = aName;
        description = aDescription;
        id = aId;
        followed = aFollowed;
    }
}
