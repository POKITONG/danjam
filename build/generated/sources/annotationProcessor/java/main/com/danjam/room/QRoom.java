package com.danjam.room;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoom is a Querydsl query type for Room
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoom extends EntityPathBase<Room> {

    private static final long serialVersionUID = -599405262L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoom room = new QRoom("room");

    public final ListPath<com.danjam.booking.Booking, com.danjam.booking.QBooking> bookings = this.<com.danjam.booking.Booking, com.danjam.booking.QBooking>createList("bookings", com.danjam.booking.Booking.class, com.danjam.booking.QBooking.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final com.danjam.dorm.QDorm dorm;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.danjam.roomImg.RoomImg, com.danjam.roomImg.QRoomImg> images = this.<com.danjam.roomImg.RoomImg, com.danjam.roomImg.QRoomImg>createList("images", com.danjam.roomImg.RoomImg.class, com.danjam.roomImg.QRoomImg.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> person = createNumber("person", Integer.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath type = createString("type");

    public QRoom(String variable) {
        this(Room.class, forVariable(variable), INITS);
    }

    public QRoom(Path<? extends Room> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoom(PathMetadata metadata, PathInits inits) {
        this(Room.class, metadata, inits);
    }

    public QRoom(Class<? extends Room> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dorm = inits.isInitialized("dorm") ? new com.danjam.dorm.QDorm(forProperty("dorm"), inits.get("dorm")) : null;
    }

}

