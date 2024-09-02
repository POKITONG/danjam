package com.danjam.booking;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBooking is a Querydsl query type for Booking
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBooking extends EntityPathBase<Booking> {

    private static final long serialVersionUID = -1051735128L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBooking booking = new QBooking("booking");

    public final DateTimePath<java.time.LocalDateTime> checkIn = createDateTime("checkIn", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> checkOut = createDateTime("checkOut", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.danjam.payment.QPayment payment;

    public final NumberPath<Integer> person = createNumber("person", Integer.class);

    public final com.danjam.room.QRoom room;

    public final StringPath status = createString("status");

    public final com.danjam.users.QUsers users;

    public QBooking(String variable) {
        this(Booking.class, forVariable(variable), INITS);
    }

    public QBooking(Path<? extends Booking> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBooking(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBooking(PathMetadata metadata, PathInits inits) {
        this(Booking.class, metadata, inits);
    }

    public QBooking(Class<? extends Booking> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.payment = inits.isInitialized("payment") ? new com.danjam.payment.QPayment(forProperty("payment"), inits.get("payment")) : null;
        this.room = inits.isInitialized("room") ? new com.danjam.room.QRoom(forProperty("room"), inits.get("room")) : null;
        this.users = inits.isInitialized("users") ? new com.danjam.users.QUsers(forProperty("users")) : null;
    }

}

