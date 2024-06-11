package com.example.buensaborback.config;


import com.example.buensaborback.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener  {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
