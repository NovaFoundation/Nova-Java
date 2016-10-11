package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class ElseStatementWriter extends ControlStatementWriter
{
	public abstract ElseStatement node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		builder.append("else");
		
		if (node().getNumChildren() == 2)
		{
			Node child = node().getChild(1);
			
			if (child instanceof IfStatement)
			{
				builder.append(' ');
				getWriter(child).writeExpression(builder);
			}
		}
		
		builder.append('\n');
		
		return getWriter(node().getScope()).write(builder);
	}
}