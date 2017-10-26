package com.jspxcms.ext.domain.dsl;

import com.jspxcms.ext.domain.QuestionOption;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

/**
 * QQuestionOption is a Querydsl query type for QuestionOption
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuestionOption extends EntityPathBase<QuestionOption> {
    private static final long serialVersionUID = -113435275L;
    private static final PathInits INITS = PathInits.DIRECT2;
    public static final QQuestionOption questionOption = new QQuestionOption("questionOption");
    public final NumberPath<Integer> count = createNumber("count", Integer.class);
    public final NumberPath<Integer> id = createNumber("id", Integer.class);
    public final QQuestionItem item;
    public final SetPath<com.jspxcms.ext.domain.QuestionOptRec, QQuestionOptRec> optRecs = this.<com.jspxcms.ext.domain.QuestionOptRec, QQuestionOptRec>createSet("optRecs", com.jspxcms.ext.domain.QuestionOptRec.class, QQuestionOptRec.class, PathInits.DIRECT2);
    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);
    public final StringPath title = createString("title");

    public QQuestionOption(String variable) {
        this(QuestionOption.class, forVariable(variable), INITS);
    }

    public QQuestionOption(Path<? extends QuestionOption> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuestionOption(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuestionOption(PathMetadata metadata, PathInits inits) {
        this(QuestionOption.class, metadata, inits);
    }

    public QQuestionOption(Class<? extends QuestionOption> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QQuestionItem(forProperty("item"), inits.get("item")) : null;
    }
}

