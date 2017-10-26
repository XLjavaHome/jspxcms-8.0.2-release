package com.jspxcms.ext.domain.dsl;

import com.jspxcms.ext.domain.QuestionItemRec;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

/**
 * QQuestionItemRec is a Querydsl query type for QuestionItemRec
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuestionItemRec extends EntityPathBase<QuestionItemRec> {
    private static final long serialVersionUID = -150826115L;
    private static final PathInits INITS = PathInits.DIRECT2;
    public static final QQuestionItemRec questionItemRec = new QQuestionItemRec("questionItemRec");
    public final StringPath answer = createString("answer");
    public final QQuestionItem item;
    public final QQuestionRecord record;

    public QQuestionItemRec(String variable) {
        this(QuestionItemRec.class, forVariable(variable), INITS);
    }

    public QQuestionItemRec(Path<? extends QuestionItemRec> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestionItemRec(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestionItemRec(PathMetadata metadata, PathInits inits) {
        this(QuestionItemRec.class, metadata, inits);
    }

    public QQuestionItemRec(Class<? extends QuestionItemRec> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QQuestionItem(forProperty("item"), inits.get("item")) : null;
        this.record = inits.isInitialized("record") ? new QQuestionRecord(forProperty("record"), inits.get("record")) : null;
    }
}

