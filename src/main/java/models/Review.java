package models;

import lombok.Data;

import java.util.Date;
@Data
public class Review {
    private String id;
    private String title;
    private String content;
    private Date createdAt;


}
