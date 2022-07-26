package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDatatype is a Querydsl query type for Datatype
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QDatatype extends BeanPath<Datatype> {

    private static final long serialVersionUID = 1461740292L;

    public static final QDatatype datatype = new QDatatype("datatype");

    public final BooleanPath array = createBoolean("array");

    public final BooleanPath isArray = createBoolean("isArray");

    public QDatatype(String variable) {
        super(Datatype.class, forVariable(variable));
    }

    public QDatatype(Path<? extends Datatype> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDatatype(PathMetadata metadata) {
        super(Datatype.class, metadata);
    }

}

