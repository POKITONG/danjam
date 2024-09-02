package com.danjam.roomImg;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomImg is a Querydsl query type for RoomImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomImg extends EntityPathBase<RoomImg> {

    private static final long serialVersionUID = 737023430L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomImg roomImg = new QRoomImg("roomImg");

    public final StringPath ext = createString("ext");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath nameOriginal = createString("nameOriginal");

    public final com.danjam.room.QRoom room;

    public final StringPath size = createString("size");

    public QRoomImg(String variable) {
        this(RoomImg.class, forVariable(variable), INITS);
    }

    public QRoomImg(Path<? extends RoomImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomImg(PathMetadata metadata, PathInits inits) {
        this(RoomImg.class, metadata, inits);
    }

    public QRoomImg(Class<? extends RoomImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new com.danjam.room.QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

