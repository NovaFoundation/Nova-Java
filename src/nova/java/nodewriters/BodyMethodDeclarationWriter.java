package nova.java.nodewriters;

import net.fathomsoft.nova.tree.*;

public abstract class BodyMethodDeclarationWriter extends NovaMethodDeclarationWriter
{
	public abstract BodyMethodDeclaration node();
	
	@Override
	public StringBuilder write(StringBuilder builder)
	{
		return writeSignature(builder).append('\n').append(getWriter(node().getScope()).write());
	}
	
	@Override
	public StringBuilder writeSignature(StringBuilder builder)
	{
		super.writeSignature(builder);
		
		return getWriter(node().getParameterList()).write(builder);
	}
}