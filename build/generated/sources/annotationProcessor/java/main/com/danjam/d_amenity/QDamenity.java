package com.danjam.d_amenity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDamenity is a Querydsl query type for Damenity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDamenity extends EntityPathBase<Damenity> {

    private static final long serialVersionUID = 1485564289L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDamenity damenity = new QDamenity("damenity");

    public final com.danjam.amenity.QAmenity amenity;

    public final com.danjam.dorm.QDorm dorm;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QDamenity(String variable) {
        this(Damenity.class, forVariable(variable), INITS);
    }

    public QDamenity(Path<? extends Damenity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDamenity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDamenity(PathMetadata metadata, PathInits inits) {
        this(Damenity.class, metadata, inits);
    }

    public QDamenity(Class<? extends Damenity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.amenity = inits.isInitialized("amenity") ? new com.danjam.amenity.QAmenity(forProperty("amenity")) : null;
        this.dorm = inits.isInitialized("dorm") ? new com.danjam.dorm.QDorm(forProperty("dorm"), inits.get("dorm")) : null;
    }

}

