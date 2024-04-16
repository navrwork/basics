package com.navr.patterns.behavioral.state;

import java.util.concurrent.atomic.AtomicLong;

public class Document {

    private long id;
    private DocumentState state;

    public Document() {
        id = IdGenerator.generateUniqueId();
        state = DocumentState.DRAFT;
        System.out.println("New Document instance created. In DRAFT state. id="+id);
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        if (state!=null) {
            switch(state) {
                case DRAFT:
                    state = DocumentState.MODERATED;
                    System.out.println("Switching from DRAFT to MODERATED state.");
                    break;
                case MODERATED:
                    state = DocumentState.PUBLISHED;
                    System.out.println("Switching from MODERATED to PUBLISHED state.");
                    break;
                case PUBLISHED:
                    System.out.println("Already in PUBLISHED state. Cannot change state.");
                    break;
            }
        }
    }
}
