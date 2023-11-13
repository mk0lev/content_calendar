package dev.martin.contentcalendar.repository;

import dev.martin.contentcalendar.model.Content;
import org.springframework.stereotype.Repository;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return content;
    }

    //Get content by id inside the list and return the first if it equals. Returns an Optional<T>
    public Optional<Content> findById(Integer id){
        return content.stream().filter(c->c.id().equals(id)).findFirst();
    }
}
