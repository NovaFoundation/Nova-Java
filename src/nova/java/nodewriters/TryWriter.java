package nova.java.nodewriters;

import net.fathomsoft.nova.tree.exceptionhandling.ExceptionHandler;
import net.fathomsoft.nova.tree.exceptionhandling.Try;

public abstract class TryWriter extends ExceptionHandlerWriter
{
	public abstract Try node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		return builder.append("try\n").append(getWriter(node().getScope()).write());
	}
}