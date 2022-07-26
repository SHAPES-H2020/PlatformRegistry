package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QService is a Querydsl query type for Service
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QService extends EntityPathBase<Service> {

    private static final long serialVersionUID = 172448149L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QService service = new QService("service");

    public final QResource _super = new QResource(this);

    //inherited
    public final ListPath<String, StringPath> description = _super.description;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final StringPath interworkingServiceURL = _super.interworkingServiceURL;

    //inherited
    public final StringPath name = _super.name;

    public final ListPath<Parameter, QParameter> parameters = this.<Parameter, QParameter>createList("parameters", Parameter.class, QParameter.class, PathInits.DIRECT2);

    public final QDatatype resultType;

    public QService(String variable) {
        this(Service.class, forVariable(variable), INITS);
    }

    public QService(Path<? extends Service> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QService(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QService(PathMetadata metadata, PathInits inits) {
        this(Service.class, metadata, inits);
    }

    public QService(Class<? extends Service> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.resultType = inits.isInitialized("resultType") ? new QDatatype(forProperty("resultType")) : null;
    }

}

