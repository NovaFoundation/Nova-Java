package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class InitializationMethodWriter extends BodyMethodDeclarationWriter
{
	public abstract InitializationMethod node();
	
	@Override
	public StringBuilder writeName(StringBuilder builder)
	{
		return builder.append("init");
	}
}