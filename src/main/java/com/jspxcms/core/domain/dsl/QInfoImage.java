package com.jspxcms.core.domain.dsl;

import com.jspxcms.core.domain.InfoImage;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.BeanPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

/**
 * QInfoImage is a Querydsl query type for InfoImage
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QInfoImage extends BeanPath<InfoImage> {
    private static final long serialVersionUID = 954495087L;
    public static final QInfoImage infoImage = new QInfoImage("infoImage");
    public final StringPath image = createString("image");
    public final StringPath name = createString("name");
    public final StringPath text = createString("text");

    public QInfoImage(String variable) {
        super(InfoImage.class, forVariable(variable));
    }

    public QInfoImage(Path<? extends InfoImage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInfoImage(PathMetadata metadata) {
        super(InfoImage.class, metadata);
    }
}

