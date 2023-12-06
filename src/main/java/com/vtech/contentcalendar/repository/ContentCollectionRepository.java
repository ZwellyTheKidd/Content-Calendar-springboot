package com.vtech.contentcalendar.repository;

import com.vtech.contentcalendar.model.Content;
import com.vtech.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.vtech.contentcalendar.model.Status.IDEA;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList =new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return  contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init (){
        Content content=new Content(1,
                "My First Blog Post",
                "My first blog post",
                IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contentList.add(content);
    }

    public void save(Content content){
        contentList.add(content);
    }


}
