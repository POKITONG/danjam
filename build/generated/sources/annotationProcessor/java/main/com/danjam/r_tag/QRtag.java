package com.danjam.r_tag;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRtag is a Querydsl query type for Rtag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRtag extends EntityPathBase<Rtag> {

    private static final long serialVersionUID = 1409536645L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRtag rtag = new QRtag("rtag");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.danjam.review.QReview review;

    public final com.danjam.tag.QTag tag;

    public QRtag(String variable) {
        this(Rtag.class, forVariable(variable), INITS);
    }

    public QRtag(Path<? extends Rtag> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRtag(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRtag(PathMetadata metadata, PathInits inits) {
        this(Rtag.class, metadata, inits);
    }

    public QRtag(Class<? extends Rtag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.review = inits.isInitialized("review") ? new com.danjam.review.QReview(forProperty("review"), inits.get("review")) : null;
        this.tag = inits.isInitialized("tag") ? new com.danjam.tag.QTag(forProperty("tag")) : null;
    }

}

