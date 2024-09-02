package com.danjam.dorm;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDorm is a Querydsl query type for Dorm
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDorm extends EntityPathBase<Dorm> {

    private static final long serialVersionUID = 1597247506L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDorm dorm = new QDorm("dorm");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath contactNum = createString("contactNum");

    public final com.danjam.d_category.QDcategory dcategory;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<com.danjam.room.Room, com.danjam.room.QRoom> rooms = this.<com.danjam.room.Room, com.danjam.room.QRoom>createList("rooms", com.danjam.room.Room.class, com.danjam.room.QRoom.class, PathInits.DIRECT2);

    public final StringPath status = createString("status");

    public final StringPath town = createString("town");

    public final com.danjam.users.QUsers user;

    public QDorm(String variable) {
        this(Dorm.class, forVariable(variable), INITS);
    }

    public QDorm(Path<? extends Dorm> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDorm(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDorm(PathMetadata metadata, PathInits inits) {
        this(Dorm.class, metadata, inits);
    }

    public QDorm(Class<? extends Dorm> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dcategory = inits.isInitialized("dcategory") ? new com.danjam.d_category.QDcategory(forProperty("dcategory")) : null;
        this.user = inits.isInitialized("user") ? new com.danjam.users.QUsers(forProperty("user")) : null;
    }

}

