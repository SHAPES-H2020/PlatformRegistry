package eu.h2020.symbiote.model.cim;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeatureOfInterest is a Querydsl query type for FeatureOfInterest
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QFeatureOfInterest extends BeanPath<FeatureOfInterest> {

    private static final long serialVersionUID = -1305515881L;

    public static final QFeatureOfInterest featureOfInterest = new QFeatureOfInterest("featureOfInterest");

    public final ListPath<String, StringPath> description = this.<String, StringPath>createList("description", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> hasProperty = this.<String, StringPath>createList("hasProperty", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QFeatureOfInterest(String variable) {
        super(FeatureOfInterest.class, forVariable(variable));
    }

    public QFeatureOfInterest(Path<? extends FeatureOfInterest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeatureOfInterest(PathMetadata metadata) {
        super(FeatureOfInterest.class, metadata);
    }

}

