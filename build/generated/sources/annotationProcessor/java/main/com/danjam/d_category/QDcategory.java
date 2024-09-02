package com.danjam.d_category;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDcategory is a Querydsl query type for Dcategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDcategory extends EntityPathBase<Dcategory> {

    private static final long serialVersionUID = -1885466999L;

    public static final QDcategory dcategory = new QDcategory("dcategory");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QDcategory(String variable) {
        super(Dcategory.class, forVariable(variable));
    }

    public QDcategory(Path<? extends Dcategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDcategory(PathMetadata metadata) {
        super(Dcategory.class, metadata);
    }

}

