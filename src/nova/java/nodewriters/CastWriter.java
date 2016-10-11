package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class CastWriter extends IValueWriter
{
	public abstract Cast node();
	
	@Override
	public StringBuilder writeExpression(StringBuilder builder)
	{
		builder.append('(').append(writeType(false)).append(')');
		
		return getWriter(node().getValueNode()).writeExpression(builder);
	}
}