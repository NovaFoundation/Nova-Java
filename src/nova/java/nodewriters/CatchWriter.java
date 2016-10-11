package nova.java.nodewriters;

import net.fathomsoft.nova.tree.exceptionhandling.Catch;
import net.fathomsoft.nova.tree.exceptionhandling.ExceptionHandler;

public abstract class CatchWriter extends ExceptionHandlerWriter
{
	public abstract Catch node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		return builder.append("catch (").append(getWriter(node().getExceptionDeclaration()).writeExpression()).append(")\n")
			.append(getWriter(node().getScope()).write(true, false)).append('\n');
	}
}