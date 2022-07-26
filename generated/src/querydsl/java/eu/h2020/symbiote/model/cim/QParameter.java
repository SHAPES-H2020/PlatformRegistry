package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParameter is a Querydsl query type for Parameter
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QParameter extends BeanPath<Parameter> {

    private static final long serialVersionUID = 367595145L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QParameter parameter = new QParameter("parameter");

    public final QDatatype datatype;

    public final BooleanPath mandatory = createBoolean("mandatory");

    public final StringPath name = createString("name");

    public final ListPath<Restriction, SimplePath<Restriction>> restrictions = this.<Restriction, SimplePath<Restriction>>createList("restrictions", Restriction.class, SimplePath.class, PathInits.DIRECT2);

    public QParameter(String variable) {
        this(Parameter.class, forVariable(variable), INITS);
    }

    public QParameter(Path<? extends Parameter> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QParameter(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QParameter(PathMetadata metadata, PathInits inits) {
        this(Parameter.class, metadata, inits);
    }

    public QParameter(Class<? extends Parameter> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.datatype = inits.isInitialized("datatype") ? new QDatatype(forProperty("datatype")) : null;
    }

}

