package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCapability is a Querydsl query type for Capability
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCapability extends BeanPath<Capability> {

    private static final long serialVersionUID = 1563108920L;

    public static final QCapability capability = new QCapability("capability");

    public final ListPath<Effect, SimplePath<Effect>> effects = this.<Effect, SimplePath<Effect>>createList("effects", Effect.class, SimplePath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final ListPath<Parameter, QParameter> parameters = this.<Parameter, QParameter>createList("parameters", Parameter.class, QParameter.class, PathInits.DIRECT2);

    public QCapability(String variable) {
        super(Capability.class, forVariable(variable));
    }

    public QCapability(Path<? extends Capability> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCapability(PathMetadata metadata) {
        super(Capability.class, metadata);
    }

}

