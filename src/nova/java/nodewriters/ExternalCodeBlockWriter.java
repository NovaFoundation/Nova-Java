package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class ExternalCodeBlockWriter extends NodeWriter
{
	public abstract ExternalCodeBlock node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		return builder.append(node().joinContents((x, expression) -> (expression ? getWriter(x).writeExpression() : getWriter(x).write()).toString())).append('\n');
	}
}