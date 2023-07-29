package BehaviourPatterns.ChainOfResponsability;

public interface ProductWarrantyChain {
	public void setNextChain(ProductWarrantyChain nextChain);
	
	public void proceed(Product e);
	
}
