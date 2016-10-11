package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class ParameterListWriter extends TypeListWriter
{
	public abstract ParameterList node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		return write(builder, true);
	}
	
	public StringBuilder write(StringBuilder builder, boolean parenthesis)
	{
		if (parenthesis)
		{
			builder.append('(');
		}
		
		final int[] i = new int[] { 0 };
		
		node().forEachVisibleChild(param -> {
			if (i[0]++ > 0)
			{
				builder.append(", ");
			}
			
			getWriter(param).writeExpression(builder);
		});
		
		if (parenthesis)
		{
			builder.append(')');
		}
		
		return builder;
	}
}