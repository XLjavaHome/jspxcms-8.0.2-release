package com.jspxcms.core.domain.dsl;

import com.jspxcms.core.domain.Notification;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

/**
 * QNotification is a Querydsl query type for Notification
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNotification extends EntityPathBase<Notification> {
    private static final long serialVersionUID = 830815881L;
    private static final PathInits INITS = PathInits.DIRECT2;
    public static final QNotification notification = new QNotification("notification");
    public final StringPath backendUrl = createString("backendUrl");
    public final NumberPath<Integer> id = createNumber("id", Integer.class);
    public final NumberPath<Integer> key = createNumber("key", Integer.class);
    public final NumberPath<Integer> qty = createNumber("qty", Integer.class);
    public final QUser receiver;
    public final DateTimePath<java.util.Date> sendTime = createDateTime("sendTime", java.util.Date.class);
    public final ListPath<String, StringPath> sources = this.<String, StringPath>createList("sources", String.class, StringPath.class, PathInits.DIRECT2);
    public final StringPath text = createString("text");
    public final StringPath type = createString("type");
    public final StringPath url = createString("url");

    public QNotification(String variable) {
        this(Notification.class, forVariable(variable), INITS);
    }

    public QNotification(Path<? extends Notification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotification(PathMetadata metadata, PathInits inits) {
        this(Notification.class, metadata, inits);
    }

    public QNotification(Class<? extends Notification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receiver = inits.isInitialized("receiver") ? new QUser(forProperty("receiver"), inits.get("receiver")) : null;
    }
}

