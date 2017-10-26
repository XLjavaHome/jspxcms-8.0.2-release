package com.jspxcms.core.domain.dsl;

import com.jspxcms.core.domain.SensitiveWord;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

/**
 * QSensitiveWord is a Querydsl query type for SensitiveWord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSensitiveWord extends EntityPathBase<SensitiveWord> {
    private static final long serialVersionUID = -65188638L;
    public static final QSensitiveWord sensitiveWord = new QSensitiveWord("sensitiveWord");
    public final NumberPath<Integer> id = createNumber("id", Integer.class);
    public final StringPath name = createString("name");
    public final StringPath replacement = createString("replacement");
    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QSensitiveWord(String variable) {
        super(SensitiveWord.class, forVariable(variable));
    }

    public QSensitiveWord(Path<? extends SensitiveWord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSensitiveWord(PathMetadata metadata) {
        super(SensitiveWord.class, metadata);
    }
}

