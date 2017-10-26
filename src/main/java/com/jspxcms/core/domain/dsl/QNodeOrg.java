package com.jspxcms.core.domain.dsl;

import com.jspxcms.core.domain.NodeOrg;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import static com.querydsl.core.types.PathMetadataFactory.forVariable;
import com.querydsl.core.types.dsl.BooleanPath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.PathInits;

import javax.annotation.Generated;

/**
 * QNodeOrg is a Querydsl query type for NodeOrg
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNodeOrg extends EntityPathBase<NodeOrg> {
    private static final long serialVersionUID = -1590857436L;
    private static final PathInits INITS = PathInits.DIRECT2;
    public static final QNodeOrg nodeOrg = new QNodeOrg("nodeOrg");
    public final QNode node;
    public final QOrg org;
    public final BooleanPath viewPerm = createBoolean("viewPerm");

    public QNodeOrg(String variable) {
        this(NodeOrg.class, forVariable(variable), INITS);
    }

    public QNodeOrg(Path<? extends NodeOrg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNodeOrg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNodeOrg(PathMetadata metadata, PathInits inits) {
        this(NodeOrg.class, metadata, inits);
    }

    public QNodeOrg(Class<? extends NodeOrg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.node = inits.isInitialized("node") ? new QNode(forProperty("node"), inits.get("node")) : null;
        this.org = inits.isInitialized("org") ? new QOrg(forProperty("org"), inits.get("org")) : null;
    }
}

