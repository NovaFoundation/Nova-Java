package nova.java.nodewriters;

import net.fathomsoft.nova.tree.generics.GenericTypeArgument;

public abstract class GenericTypeArgumentWriter extends IValueWriter
{
    public abstract GenericTypeArgument node();

    @Override
    public StringBuilder writeExpression(StringBuilder builder)
    {
        return builder.append(node().isPrimitive() ? node().getTypeClass().getName() : node().getType());
    }
}