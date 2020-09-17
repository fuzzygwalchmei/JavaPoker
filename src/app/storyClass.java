package JavaPoker.JavaPoker.src.app;

public class storyClass {
    private static int id = 1000;
    private String description;
    private String status = "New";
    private int points = 999;
    private int storyID;

    public void StoryClass(String description) {
        this.description = description;
        this.storyID = id;
        id++;
    }

    public String toString(){
        return "ID: "+storyID+"\tDesc: "+description+"\tStatus: "+status+"\tPoints: "+points;
    }
}
