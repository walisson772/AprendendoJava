package blog.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Coments> coments = new ArrayList<>();

    public Post(){
    }
    public Post(Date moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coments> getComents() {
        return coments;
    }

    public void addComents(Coments coment){
        coments.add(coment);
    }
    public void removeComents(Coments coment){
        coments.remove(coment);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(fmt.format(moment)+ "\n");
        sb.append(content + "\n");
        sb.append("Coments: \n");
        for (Coments c : coments){
            sb.append(c.getText()+ "\n");
        }
        return sb.toString();
    }
}
