package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class ClosureDeclarationWriter extends ParameterWriter
{
	public abstract ClosureDeclaration node();

	@Override
	public StringBuilder writeExpression(StringBuilder builder)
	{
		if (node().getType() == null)
		{
			builder.append("NovaUtilities.Consumer");
		}
		else
		{
			builder.append("NovaUtilities.Function");
		}
		
		builder.append(node().getParameterList().getNumParameters());
		
		builder.append("<");
		
		getWriter(node().getParameterList()).write(builder, false);
		
		if (node().getType() != null)
		{
			if (node().getParameterList().getNumParameters() > 0)
			{
				builder.append(", ");
			}

			builder.append(node().isPrimitive() ? node().getTypeClass().getName() : node().getType());
		}
		
		return builder.append("> ").append(getWriter(node()).writeName());
	}
}