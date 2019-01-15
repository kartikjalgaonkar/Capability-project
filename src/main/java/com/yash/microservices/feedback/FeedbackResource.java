package com.yash.microservices.feedback;

import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;

@Data
public class FeedbackResource extends ResourceSupport {
    private String username;
    private String source;
    private Integer rating;
    private String comment;
    private Date createdTime;
}
