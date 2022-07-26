package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSymbolicLocation is a Querydsl query type for SymbolicLocation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSymbolicLocation extends EntityPathBase<SymbolicLocation> {

    private static final long serialVersionUID = 1295603623L;

    public static final QSymbolicLocation symbolicLocation = new QSymbolicLocation("symbolicLocation");

    public final QLocation _super = new QLocation(this);

    //inherited
    public final ListPath<String, StringPath> description = _super.description;

    //inherited
    public final StringPath name = _super.name;

    public QSymbolicLocation(String variable) {
        super(SymbolicLocation.class, forVariable(variable));
    }

    public QSymbolicLocation(Path<? extends SymbolicLocation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSymbolicLocation(PathMetadata metadata) {
        super(SymbolicLocation.class, metadata);
    }

}

