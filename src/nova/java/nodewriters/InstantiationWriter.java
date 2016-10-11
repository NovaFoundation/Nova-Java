package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;
import net.fathomsoft.nova.tree.variables.Array;

public abstract class InstantiationWriter extends IIdentifierWriter
{
	public abstract Instantiation node();
	
	@Override
	public StringBuilder writeUseExpression(StringBuilder builder)
	{
		return builder.append("new ").append(getWriter(node().getIdentifier()).writeUseExpression());
	}
}