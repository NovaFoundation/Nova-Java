package nova.java.nodewriters;

import net.fathomsoft.nova.tree.variables.Array;

public abstract class ArrayWriter extends VariableDeclarationWriter
{
	public abstract Array node();
	
	@Override
	public StringBuilder writeUseExpression(StringBuilder builder)
	{
		return writeType(builder, false);
	}
	
	@Override
	public StringBuilder writeArrayDimensions(StringBuilder builder)
	{
		return getWriter(node().getDimensions()).writeExpression(builder);
	}
}